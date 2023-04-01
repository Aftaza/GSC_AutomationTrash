#include <ESP8266HTTPClient.h>
#include <ESP8266WiFi.h>
#include <WiFiClient.h> 
#include <ESP8266WebServer.h>

const char* ssid = "Noted9";
const char* password = "samsung123";

long duration, jarak;
WiFiClient wifiClient;

#define outIjo D0 
#define outAbang D1
#define eco D7
#define trig D8
#define infra D2

void setup() {
  Serial.begin(9600);

  WiFi.begin(ssid, password);
  Serial.println("Connecting");
  while(WiFi.status() != WL_CONNECTED){
    Serial.print(".");
    delay(500);
  }
  Serial.println("\nConnected WiFi");
  Serial.print("IP: ");
  Serial.println(WiFi.localIP());

  // put your setup code here, to run once:
  pinMode(trig, OUTPUT);
  pinMode(eco, INPUT);
  pinMode(LED_BUILTIN, OUTPUT);
  pinMode(outIjo, OUTPUT);
  pinMode(outAbang, OUTPUT);
  pinMode(infra, INPUT);
}

void loop() {

  //infraRed();
  //ultrasonik fungsi
  ultraSonik();
  // put your main code here, to run repeatedly:
  if(jarak <= 16){
    Serial.println("Masuk nih " + String(jarak));
    pushServer();
  }
  delay(500);
}

void pushServer(){
  HTTPClient http;
  String errorMessage = "";
  String response = "";
  int iter = 0;

  String host = "http://122.248.220.238/index.php?state=1&nilai=" + String(jarak);
  http.begin(wifiClient, host);
  int httpCode = http.GET();
  if (httpCode > 0) {
    response = http.getString();
    Serial.println(httpCode);
    http.end();
    digitalWrite(outIjo, LOW);
    digitalWrite(outAbang, LOW);
    if (httpCode != 200) {
      // Bad Response Code
      errorMessage = "Error response (" + String(httpCode) + "): ";
      Serial.println(errorMessage);
      return;  
    }else{
      while(iter < 3 ){
        digitalWrite(outIjo, LOW);
        delay(250);
        digitalWrite(outIjo, HIGH);
        delay(250);
        iter++;
      }
    }
  }
}

void ultraSonik(){
  digitalWrite(trig, LOW);
  delayMicroseconds(5);
  digitalWrite(trig, HIGH);
  delayMicroseconds(10);
  digitalWrite(trig, LOW);
  duration = pulseIn(eco, HIGH);
  jarak = (duration/2) / 29.1;
  // Serial.println("Jarak: ");
  // Serial.print(jarak);
  // Serial.println(" cm");
  if(jarak > 15){
    digitalWrite(outIjo, LOW);
    digitalWrite(outAbang, HIGH);
  }else{
    digitalWrite(outAbang, LOW);
    digitalWrite(outIjo, HIGH); 
  }
}

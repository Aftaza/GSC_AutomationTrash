import {  ImageBackground, Button, StyleSheet, Text, View } from 'react-native'
import React, { useEffect } from 'react'
import { BackgroundLogo, BiruGelap, pagePutih, welcomeTo, Logo, Loggin, Line, Birunavy, Logggin } from '../../assets'
import { Image } from 'react-native-svg'

const Login = ({ navigation }) => {
    return(
        <ImageBackground source={BackgroundLogo} style={styles.first}>
        <ImageBackground source={Logo} style={styles.logo}/>
        <ImageBackground source={pagePutih} style={styles.second}>
        <ImageBackground source={Loggin} style={styles.loggin}/>
        <ImageBackground source={pagePutih} style={styles.email}>
            <View>
                <Text>E-Mail</Text>
            </View>
        </ImageBackground>
        <ImageBackground source={Line} style={styles.secondd}/>
        <ImageBackground source={pagePutih} style={styles.password}>
            <View>
                <Text>Password</Text>
            </View>
        </ImageBackground>
        <ImageBackground source={Line} style={styles.secondd}/>
        <ImageBackground source={pagePutih} style={styles.new}>
            <View>
                <Text>Remember me</Text>
            </View>
        </ImageBackground>
        <ImageBackground source={pagePutih} style={styles.neww}>
            <View>
                <Text>Forgotten Password</Text>
            </View>
        </ImageBackground>
        <ImageBackground source={Birunavy} style={styles.bn}>
            <ImageBackground source={Logggin} style={styles.bnn}>
                <View>
                    <Text onPress={() => navigation.navigate('MainApp')}></Text>
                </View>
            </ImageBackground>
        </ImageBackground>
        </ImageBackground>
    </ImageBackground>
        // <View>
        //     <Text>Login Page</Text>
        //     <Button onPress={() => navigation.navigate('Signup')} title="Neead an account?"/>
        // </View>
    )
}
export default Login

const styles = StyleSheet.create({
    first: {
        flex: 1,
        alignItems: 'center',
        justifyContent: 'center'
    },
    second: {
        marginTop: 100,
        width: 477,
        height: 700,
        borderRadius: 30,
        borderLeftWidth:0,
        borderWidth:30,
        borderColor: '#fff'
    },
    logo: {
      marginTop: 150,
      width: 300,
      height: 300
    },
    loggin: {
        marginTop: -10,
        marginLeft: 190,
        width: 90,
        height: 21
    },
    email: {
        marginTop: 55,
        marginLeft: 30,
    },
    secondd: {
        marginTop: 40,
        marginLeft: 30,
        width: 420,
        height: 3,
    },
    password: {
        marginTop: 40,
        marginLeft: 30,
    },
    new: {
        marginTop: 10,
        marginLeft: 60,
    },
    neww: {
        marginTop: 10,
        marginLeft: 280,
    },
    bn: {
        marginTop: 40,
        marginLeft: 180,
        width: 120,
        height: 32,
    },
    bnn: {
        marginTop: 2,
        marginLeft: 11,
        width: 93,
        height: 24,
    }
   
  
})
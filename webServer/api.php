<?php
$servername = "localhost";
$username = "root";
$password = "aftaza";
$dbname = "gscTrash";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
  die("Connection failed: " . $conn->connect_error);
}

$com = $_GET['com'];
switch($com){
  case '':normal();break;
  default:normal();break;
}

function normal(){
  global $conn;
  $sqli = "SELECT * FROM deteks ORDER BY id DESC LIMIT 1";
  $query = mysqli_query($conn, $sqli);
  while($f1 = mysqli_fetch_array($query)){
	$signal = array(
		'jarak' => $f1['userId'],
		'signal' => $f1['detection']
  		);
  }
  $data['data']['result'] = $signal;
  echo json_encode($data);
}

?>

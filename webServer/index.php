<?php
$state = $_GET['state'];
$nilai = $_GET['nilai'];
$servername = "localhost";
$username = "root";
$password = "aftaza";
$dbname = "gscTrash";
$value = null;

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
  die("Connection failed: " . $conn->connect_error);
}

if ($state == 1){
  $value = true;
}else{
  $value = false;
}

if ($value != null && $nilai != null){ 
  $sql = "INSERT INTO deteks (userId, detection)
VALUES ($nilai, $value)";
  $conn->query($sql);
}

$conn->close();
?>
<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="UTF-8">
  <title>404 - GSc Insight</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="style.css">

</head>
<body>
<!-- partial:index.partial.html -->
<div class="text">
  <h1>404</h1>
	<h2>Uh, Ohh</h2>
  <h3>Sorry we cant find what you are looking for 'cuz its so dark in here</h3>
</div>
<div class="torch"></div>
<!-- partial -->
  <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js'></script><script  src="script.js"></script>

</body>
</html>

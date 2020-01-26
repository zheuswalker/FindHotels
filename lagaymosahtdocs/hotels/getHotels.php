<?php
include 'predefiner.php';
$feedcontent = array();
$query = "select hotelname, hoteldesc from hotels";
	if ($result = $conn->query($query)) 
while($row = $result->fetch_array(MYSQL_ASSOC))
$feedcontent [] = $row;
$output = json_encode(array('hotellist' => $feedcontent	));
echo $output;
$conn->close();
?> 


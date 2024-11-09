<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" type="text/css"
href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css" />
    <link rel="stylesheet" type="text/css" href="styles.css">
    <title>Add Room Email </title>
</head>
<body>
<h1>INFY HOTEL TEAM</h1>
<div>Hi  <b>${user}</b>,
<p>You have successfully added ${roomType} room.Please see your added room details as below:</p>
 <p>Room Type : <b>${roomType}</b></p> <p>Added Date : <b>${BookingDate}</b></p>
 <p> Amenities Details :</p>
<ul>
<#list amenities as item>
<li>${item}</li>
</#list>
</ul>
</div>
<br/>
<div> Have a nice day..!</div>
<div> Infy Hotel Team</div>
</body>
</html>
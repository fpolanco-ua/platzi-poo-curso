<?php 
require_once("car.php");
require_once("uberX.php");
require_once("uberPool.php");
require_once("account.php");

$uberX = new UberX("CVB123",new Account("Andres Herrera","AND123"),"Chevrolet","Spark");
$uberX->printDataCar();

$uberPool = new UberPool("CVB222",new Account("Andres Herrera","AND123"),"Chevrolet","Spark");
$uberPool->printDataCar();

$uberX = new UberPool("CVB123",new Account("Andres Herrera","AND123"),"Chevrolet","Spark");
$uberX->printDataCar();
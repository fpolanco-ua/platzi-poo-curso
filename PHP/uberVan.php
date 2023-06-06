<?php
require_once('car.php');
class UberVan extends Car
{
    public $typeCarAccepted;
    public $seatsMaterial;

    public function __construct($license, $driver,$typeCarAccepted,$seatsMaterial)
    {
        parent::__construct($license, $driver); # es como super en JAVA
        $this->typeCarAccepted = $typeCarAccepted;
        $this->seatsMaterial = $seatsMaterial;
    }
}
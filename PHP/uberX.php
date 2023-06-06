<?php
require_once('car.php');
class UberX extends Car
{
    public $brand;
    public $model;

    public function __construct($license, $driver)
    {
        parent::__construct($license, $driver); # es como super en JAVA
        $this->license = $license;
        $this->driver = $driver;
    }
}

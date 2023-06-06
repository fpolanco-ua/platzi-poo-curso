from car import Car
from account import Account

if __name__=="__main__":
    print("Hola")
    car = Car("AMD111",Account("FERNANDO","774085744"))
    print(vars(car))
    print(vars(car.driver))
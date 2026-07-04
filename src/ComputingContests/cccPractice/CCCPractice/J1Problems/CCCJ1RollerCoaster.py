# My dad solved this one 

my_place_in_line = 5
num_of_cars = 2
num_of_people_one_car_can_hold = 3

my_place_in_line = int(input())
num_of_cars = int(input())
num_of_people_one_car_can_hold = input()

if((num_of_people_one_car_can_hold / num_of_cars) - my_place_in_line >= 0):
    print("yes")
else:
    print("no")



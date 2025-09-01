#!/bin/python

from shoes import Shoes

low = Shoes('And ls',30)
medium = Shoes('Air Force ls',120)
high = Shoes('OFF Whites',400)

try:
    shoes_budget = float(input("What is your shoe budget?"))
except ValueError:
    exit("Please enter a number")
for shoes in [high,medium,low]:
    shoes.buy(shoes_budget)
    shoes_budget -= shoes.price
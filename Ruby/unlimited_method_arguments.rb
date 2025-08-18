def adder(a=0,b=1,*numbers,**args)
    sum = 0
    numbers.each { |number| sum += number}
    sum
end

p adder(1,2,1)
p adder(1,2,1,2)
p adder(5,55,1,2,3,4,5)
p adder(1,2)
p adder

p adder(1,2,1,2,3,4,a:"Hello World")

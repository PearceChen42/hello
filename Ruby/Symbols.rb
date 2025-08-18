# Symbol - a lightweight, immutable Ruby object that is used as an identifier

puts :hello
puts :hello.class

p "hello".methods.length
p :hello.methods.length

puts

a = "hello"
b= "hello"
c = :hello
d = :hello
e = c

puts a.object_id
puts b.object_id
puts c.object_id
puts d.object_id
puts e.object_id
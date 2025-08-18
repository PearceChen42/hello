a = [1,2,3]
b = a.dup
c = a.clone

p a.object_id
p b.object_id
p c.object_id

a << 4
p a
p b
p c

puts

d = " Shop Rite"
e= d
c = d.dup
d.upcase!
p d
p e
p c
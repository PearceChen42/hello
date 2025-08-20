#Proc - an object representation of reuseble a block
#
#
#
to_cubes = Proc.new { |number| number ** 3 }
to_cubes = Proc.new do |number| number ** 3 end
to_cubes = proc { |number| number ** 3 }

a= [1,2,3,4,5]
b = [6,7,8,9,10]
c = [11,12,13,14,15]

p a.map { |number| number ** 3 }
puts

p a.map &to_cubes
p b.map(&to_cubes)
p c.map &to_cubes
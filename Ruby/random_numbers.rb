puts rand
puts rand.round(2)

puts

puts rand(100 + 1)

puts rand(1..100)

story= "Once upon a time in a land far, far away..."

puts story[27..39]
puts story.slice(27..39)
puts story[27...39]
puts story.slice(27...39)
puts story[27..100]
puts story[27..-3]

story[12..15]="season"
p story

numbers = [1,3,5,7,9,15,21,18,6]
p numbers[4..6]

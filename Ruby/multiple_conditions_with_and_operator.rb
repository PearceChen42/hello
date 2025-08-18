# &&
# AND

puts "Please enter username"
username = gets.chomp
puts "Please enter password"

password = gets.chomp

if username == "rubydev1" && password == "topsecret"
    puts "Congrats, you've logged in!"
else
    puts "Incoreect,no access for you!"
end
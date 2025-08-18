password = "starwars"

# if password != "whiskers"
#     puts "Welcome to the system"
# else
#     puts "Incorectt password"
# end

unless password == "whiskers"
    puts "Incorrect password" 
end

if !password.include?("d")
    puts "This will run UNLESS password does include 'a'"
end
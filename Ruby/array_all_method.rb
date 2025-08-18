sports = ["socer","baseball","tennis","golf"]

p sports.any? { |sport| sport.length == 8 }
p sports.all? { |sport| sport.length == 8 }
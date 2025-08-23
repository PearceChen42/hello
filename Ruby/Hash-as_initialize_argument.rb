class Candidate
  attr_reader :name, :age, :occupation, :hobby, :birthplace
  def initialize(details)
    @name = details[:name]
    @age = details[:age]
    @occupation = details[:occupation]
    @hobby = details[:hobby]
    @birthplace = details[:birthplace]
  end
end

senator = Candidate.new({
  name:"Mr. Smith",
  age: 53,
  occupation: "Banker",
  hobby:"Fishing",
})

p senator.name
p senator.age
p senator.occupation
p senator.hobby
p senator.birthplace
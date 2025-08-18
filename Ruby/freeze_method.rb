# freeze - make it immutable

name = "Boris".freeze
hobbies = ["Coding","Sushi"].freeze

# name << "The Genius"

# hobbies << "Winning"

# name.upcase!

name_dup = name.dup
name_dup << " the Genius"
p name_dup

name_clone = name.clone
# name_clone << "the Geniu"

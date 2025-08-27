require "set"

plays = Set.new(["Romeo and Juliet", "Hamlet"])
p plays
p plays.class

plays.add("King Lear")
plays.add("King Lear")
p plays

p plays.delete "Hamlet"
words = ["racecar","selfless","sentences","level"]

palindromes = words.select { |word| word == word.reverse   } #  if boolean true and return value in new array

p palindromes

animals = ["cheetah","cat","lion","elephant","dog","cow"]

p animals.reject { |animal| animal.include? "c"  }#  if boolean false and return value in new array



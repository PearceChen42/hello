spice_girls = {
  scary: "Melanie Brown",
  sporty: "Melaine Chisshollm",
  baby: "Emma Buton",
  posh: "Victoria Beckham"
}

p spice_girls.to_a
power_rangers = [
  [:red,"Jason"],
  [:black, "Zack"],
  [:pink, "Kimberly"]
]
p power_rangers.to_h

p spice_girls.delete(:scary)
p spice_girls.delete(:sporty)
p spice_girls
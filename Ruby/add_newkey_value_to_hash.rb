menu = { burger: 3.99, taco: 1.99, chips: 1.99 }
p menu
p menu.length

menu[:filet_mignon] =29.99
p menu

menu[:taco] = 2.99
p menu

menu.store(:salmon,49.9)
p menu
p menu.length
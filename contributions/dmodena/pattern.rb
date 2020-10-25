#!/usr/bin/env ruby

def tab(amount)
  "    " * amount
end

def star
  "*"
end

def tabbed_stars(amount)
  return unless amount > 0
  return star if amount == 1

  star + (tab(2) + star) * (amount - 1)
end

def print_pyramid(height)
  i = 0
  while i < height do
    tab_size = height - (i + 1)
    tabbed_stars_amount = i + 1

    puts tab(tab_size) + tabbed_stars(tabbed_stars_amount)
    i += 1
  end
end

height = gets.to_i
print_pyramid height

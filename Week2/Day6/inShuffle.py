import random

def get_random(floor, ceiling):
    return random.randrange(floor, ceiling + 1)

def shuffle(the_list):
    # For each index in the list
    for first_index in xrange(0, len(the_list) - 1):
        # Grab a random other index
        second_index = get_random(0, len(the_list) - 1)
        # And swap the values
        if second_index != first_index:
            the_list[first_index], the_list[second_index] = \
                the_list[second_index], the_list[first_index]

sample_list = [1, 2, 3, 4, 5]
print 'Sample list:', sample_list

print 'Shuffling sample list...'
shuffle(sample_list)
print sample_list


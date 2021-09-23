import time

halp = time.get_clock_info('time')
halp2 = time.get_clock_info('monotonic')
halp3 = time.get_clock_info('process_time')
halp4 = time.get_clock_info('perf_counter')

print(halp)
print(halp2)
print(halp3)
print(halp4)

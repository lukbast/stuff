from datetime import datetime as dt
import pytz

print(dt.today())
print(dt.now())
print(dt.utcnow())

# country = ''
# tz_to_display = pytz.timezone(country)
# lt = dt.now(tz=tz_to_display)
#
# print(lt)

# for x in pytz.country_names:
#     print('{}: {}, {}'.format(x, pytz.country_names[x],
#     pytz.country_timezones.get(x)))

print('Naive local time {}'.format(dt.now()))
print('Naive UTC {}'.format(dt.utcnow()))
#
aware_utc = pytz.utc.localize(dt.now())
alc = pytz.utc.localize(dt.now()).astimezone()

print('Aware local time {}, time zone {} '.format(alc, alc.tzinfo))
print(nlc)
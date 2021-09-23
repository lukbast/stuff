from kivy.app import App
from kivy.lang import Builder
from kivy.uix.screenmanager import ScreenManager, Screen
import json
import pytz
from datetime import datetime

Builder.load_file('design.kv')


class LoginScreen(Screen):
    def sign_up(self):
        self.manager.current = 'SignUp_screen'


class SignUpScreen(Screen):
    def add_user(self, uname, pwd):
        utc = pytz.utc.localize(datetime.utcnow()).strftime('%Y-%m-%d %H-%M-%S')
        local_time = datetime.now().strftime('%Y-%m-%d %H-%M-%S')
        len(utc)

        user = {'username': uname, 'password': pwd,
                'created_utc': utc,
                'created_local': local_time}
        with open('users.json') as file:
            users = json.load(file)

        users[uname] = user
        with open('users.json', 'w') as file:
            json.dump(users, file)


class RootWidget(ScreenManager):
    pass


class MainApp(App):
    def build(self):
        return RootWidget()


if __name__ == "__main__":
    MainApp().run()

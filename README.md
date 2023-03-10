	 
*(deadline  **<b>20 марта 2023 г.</b>**)*
## Практикум SDET: тестовое задание

### Тестовое задание

1. На языке программирования Java (версия на ваш выбор) создать проект UI-автотестов по
   тест-кейсам описанным ниже
2. **В проекте использовать:**
- Selenium Webdriver (желательно использовать браузер Chrome)
- При поиске элементов на странице использовать как минимум по одному селектору из
  перечисленных: css, xpath, id
- Один из тестовых фреймворков: TestNG, JUnit 4/5
- Один из сборщиков: Maven, Gradle.

3. Результаты оформить в виде проекта на GitHub
4. В проекте желательно использовать паттерн проектирования Page Object Model
5. Приветствуется, но не обязательно, реализация формирования отчетов о пройденных
   тестах через Allure

## Кейс 1 Проверка успешной покупки
**Предусловие:**
1. Открыть браузер
2. Перейти на страницу входа: **https://www.saucedemo.com/**
3. Заполнить поле <b>*Username*</b> значением <b>*standard_user*</b>
4. Заполнить поле <b>***Password***</b> значением <b>*secret_sauce*</b>
5. Нажать на кнопку <b>*LOGIN*</b>

**Шаги:**
1. Положить первый продукт в списке на странице  <b>*PRODUCTS*</b> в корзину кнопкой <b>ADD TO CART</b>
2. Нажать на иконку корзины.
3. На открывшейся странице корзины нажать кнопку <b>*CHECKOUT*</b>
4. На открывшейся странице <b>*CHECKOUT: YOUR INFORMATION*</b> заполнить поля <b>*First Name, Last
   Name, Zip Code*</b> значением <b>test</b>
5. Нажать на кнопку <b>*CONTINUE*</b>
6. На открывшейся странице <b>*CHECKOUT: OVERVIEW*</b> нажать кнопку <b>*FINISH*</b>

**Ожидаемый результат:**
1. Произошел редирект на страницу завершения покупки:
   **https://www.saucedemo.com/checkout-complete.html**
2. На странице отображается сообщение: <b>*“THANK YOU FOR YOUR ORDER”*</b>

## Кейс 2 Проверка сообщения об ошибке при
попытке ввода логина на несуществующего
пользователя

**Предусловие:**
1. Открыть браузер
2. Перейти на страницу входа: **https://www.saucedemo.com/**

**Шаги:**
1. Заполнить поле <b>*Username*</b> значением <b>*test*</b>
2. Заполнить поле <b>*Password*</b> значением <b>*test*</b>
3. Нажать на кнопку <b>*LOGIN*</b>

**Ожидаемый результат:**
1. На странице появилось сообщение: <b>*“Epic sadface: Username and password do not match any
   user in this service”*</b>

### Подписывайся
на наши социальные сети 👇

## **[VK](https://vk.com/simbirsoft_team)**

## **[YouTube](https://www.youtube.com/user/SimbirSoft?app=desktop)**

## **[Telegram](https://t.me/simbirsoft_dev)**

<style>
b { color: SteelBlue }
</style>









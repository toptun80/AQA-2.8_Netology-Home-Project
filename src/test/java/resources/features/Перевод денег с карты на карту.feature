#language:ru

Функциональность: Перевод денег между своими счетами
 Структура сценария: : Успешный перевод денег с карты на карту
  Пусть совершен переход на страницу "Авторизация" по ссылке "loginUrl"
  Когда в поле "Логин" введено значение "<login>"
  Когда в поле "Пароль" введено значение "<password>"
  И выполнено нажатие на кнопку "Продолжить"
  Тогда страница "СМС подтверждение авторизации" загрузилась
  Когда в поле "СМС-код" введено значение "<code>"
  И выполнено нажатие на кнопку "Подтвердить"
  Тогда страница "Личный кабинет" загрузилась
  Когда выполнено нажатие на кнопку "Пополнить"
  Тогда страница "Пополнение карты" загрузилась
  Когда в поле "Сумма" введено значение "<amount>"
  И в поле "Откуда" введено значение "<cardNumber>"
  И выполнено нажатие на кнопку "Пополнить"
  Тогда страница "Личный кабинет" загрузилась
  И элемент "Информация о карте" содержит внутренний текст "<balance>"

  Примеры:
   | login | password  | code  | amount | cardNumber          | balance       |
   | vasya | qwerty123 | 12345 | 5000   | 5559 0000 0000 0002 | баланс: 15000 |
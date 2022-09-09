# Лекция 2

## Реализация поставленных задач:

[Ссылка на Pull request](https://github.com/Maynim/ylab-stream-api/pull/1).

## Задачи:

>1. Убрать дубликаты, отсортировать по идентификатору, сгруппировать по имени.

Решение: [ссылка на коммит](https://github.com/Maynim/ylab-stream-api/pull/1/commits/a30e8150cda2488dc33b1c495a4028955a35b9ed).

>2. `[3, 4, 2, 7], 10 -> [3, 7]` - вывести пару именно в скобках, которые дают сумму - 10

Решение: [ссылка на коммит](https://github.com/Maynim/ylab-stream-api/pull/1/commits/2f7bff4e3de2c4fecca7e259a4b20892a7cfc49d).

Доп. комментарии: для решения задачи были созданы: класс `Pair`, являющийся контейнером для искомой пары чисел,
и перечисление `Status`, с помощью которого происходит дальнейшая обработка полученного результата функцией.

>3. Реализовать функцию нечеткого поиска<p>
     `fuzzySearch("car", "ca6$$#_rtwheel"); // true`<p>
     `fuzzySearch("cwhl", "cartwheel"); // true`<p>
     `fuzzySearch("cwhee", "cartwheel"); // true`<p>
     `fuzzySearch("cartwheel", "cartwheel"); // true`<p>
     `fuzzySearch("cwheeel", "cartwheel"); // false`<p>
     `fuzzySearch("lw", "cartwheel"); // false`

Решение: [ссылка на коммит](https://github.com/Maynim/ylab-stream-api/pull/1/commits/a56411b4c6fff661144c24e83f6e0805e1a51882).

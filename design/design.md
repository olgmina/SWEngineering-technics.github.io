# Проектирование

## Архитектурное проектирование

Архитектурное проектирование – декомпозиция структуры (статический аспект) и организация взаимодействия  компонент (динамический).

1 Принципы проектирования

__Декомпозиция__  заключается в разбиении системы на отдельные компоненты, модули или слои. Каждый компонент выполняет определенную функцию и имеет четкие границы и интерфейсы для взаимодействия с другими компонентами. Декомпозиция структуры позволяет разделить сложную систему на более простые и управляемые части, что делает проект более понятным, модульным и легко расширяемым.

Для обеспечения взаимодействия компоненты используют __интерфейсы__, сообщения, события или другие эффективные механизмы передачи данных или управления. Организация взаимодействия позволяет компонентам системы совместно выполнять сложные задачи, обмениваться информацией и реагировать на изменения внутри системы или внешние события.

__Связность__, или прочность (_англ. cohesion_) — мера силы __взаимосвязанности__ элементов внутри модуля

__Связанность__, или зацепление, сцепление, связанность, сопряжение (англ. _coupling_) — способ и степень _взаимозависимости_ между программными модулями

При проектирование модулей (классов) должны быть ___слабая связность и сильное зацепление___![image](https://github.com/olgmina/SWEngineering-technics.github.io/assets/65451923/7e509358-17b9-4beb-9779-83d2823842ca).



Результат деятельности по проектированию должен описывать __архитектуру программного обеспечения__

Архитектура – это структура, взаимодействие и управление. Начинать проектирование следует со структуры, поэтому на первом этапе необходимо определиться с функциональностью. Деление на модули/подсистемы лучше все-го производить исходя из тех задач, которые решает система. Основная задача разбивается на составляющие ее подзадачи, которые могут выполняться незави-симо друг от друга. Каждый модуль должен отвечать за решение какой-то под-задачи и выполнять соответствующую ей функцию.

В большинстве программных систем можно выделить три группы функ-ций, ориентированных на решение различных подзадач:

-	функции ввода и отображения данных (обеспечивают взаимодей-ствие с пользователем);
	
-	прикладные функции, характерные для данной предметной области;
  	
-	функции управления ресурсами (файлами, базой данных и т.д.)
  
Выполнение этих функций в основном обеспечивается программными средствами, которые можно представить в виде взаимосвязанных компонентов (исполняемый код, имеющий API) или связанных программных модулей. Наиболее распростренные архитектуры:

![image](https://github.com/olgmina/SWEngineering-technics.github.io/assets/65451923/995ae2e5-99de-4033-b017-8b2a0117e49a)

## Задача 21. Разделение функциональности по компонентам

1. Выберите архитектурный стиль
_Так,![image](https://github.com/olgmina/SWEngineering-technics.github.io/assets/65451923/18d6b74f-0d0e-4bb6-b938-309e4d1bf7e9)

   Компонент Модель(Model) представляет собой совокупную модель дан-ных предметной области, реализованной в приложении. Представление(View) – это компонент, отвечающий за отображение Модели и реализацию ее взаимо-действия с пользователем. Вся логика по обработке действий пользователя через View для управления Model сосредоточена в компоненте Контроллер (Controller).__ 

2. Каждый модуль или компонент должен быть описан (назначение и функции в системе).
   CRC-карточка
   
4. Поделите модули на пакеты, определяющие функцию

Принципы SOLID:

___Single Responsibility Principle, SRP___ Принцип единственной ответственности: класс должен иметь только одну причину для изменений. Это означает, что каждый класс должен быть ответственен только за одну часть функциональности программы.

___Open/Closed Principle, OCP___ Принцип открытости/закрытости: программные сущности (классы, модули, функции и т.д.) должны быть открытыми для расширения, но закрытыми для модификации. Это означает, что изменение поведения сущности должно быть возможным через создание дополнительных классов, а не путем изменения исходного кода.

___Liskov Substitution Principle, LSP____ Принцип подстановки Барбары Лисков: объекты одного типа могут быть заменены объектами другого типа, не нарушая правильности программы. Это означает, что подклассы должны быть взаимозаменяемыми суперклассами.

___Interface Segregation Principle, ISP___ Принцип разделения интерфейса: клиенты не должны зависеть от интерфейсов, которые они не используют. Это означает, что объединение неперекрывающихся интерфейсов для разных клиентов позволяет избежать зависимости от неиспользуемых методов и свойств.

___Dependency Inversion Principle, DIP___ Принцип инверсии зависимостей: зависимости должны быть относительно стабильными и не должны изменяться при изменении модуля, от которого они зависят. Это означает, что модули должны зависеть от абстракций, а не от конкретных реализаций.

Использование принципов SOLID позволяет создать программные структуры среднего уровня, которые терпимы к изменениям, понятны и просты, а, следовательно пригодны для повторного использования и модификации


[Пример](https://github.com/olgmina/SWEngineering-technics.github.io/blob/e8679238e19c82118510f8a239dfa5fc345eaccf/design/%D0%9F%D1%80%D0%B8%D0%BC%D0%B5%D1%80%D1%8B%20%D0%BF%D0%BE%D1%81%D1%82%D1%80%D0%BE%D0%B5%D0%BD%D0%B8%D1%8F%20%D0%B4%D0%B8%D0%B0%D0%B3%D1%80%D0%B0%D0%BC%D0%BC%20%D0%BF%D0%BE%D1%81%D0%BB%D0%B5%D0%B4%D0%BE%D0%B2%D0%B0%D1%82%D0%B5%D0%BB%D1%8C%D0%BD%D0%BE%D1%81%D1%82%D0%B5%D0%B9.pdf)

## Разработка пользовательского интерфейса

Интерфейс имеет важное значение для любой программной системы и яв-ляется неотъемлемой ее составляющей, ориентированной, прежде всего, на ко-нечного пользователя. Именно через интерфейс пользователь судит о приклад-ной программе в целом; более того, часто решение об использовании приклад-ной программы пользователь принимает по тому, насколько ему удобен и поня-тен пользовательский интерфейс. Разработка графического пользовательского интерфейса для некоторых программ – обучающих, игровых, имитаторов устройств и приборов, выступает как отдельный компонент создаваемого ПО и влияет на весь процесс проектирования. 


## Задача 22. Проектирование пользовательского интерфейса

1. Составьте таблицу реакция - отлик для определения необходимых элементов интерфейса
Действие пользователя	| Отклик системы	| Элемент интерфейса |
----------------------|-----------------|--------------------|
Нажатие на кнопку | Старт	Вывод формы для ввода логина и пароля	| Панель основной сцены |

2. Выполните "раскадровку интерфейса"
   ![image](https://github.com/olgmina/SWEngineering-technics.github.io/assets/65451923/08af5372-3dc6-462c-ac2d-882fe71baf6c)


## Детальное проектирование
Детализация проектных решений закрепляется в виде проектных аретфактов UML. 

## Задание 24. Моделирование взаимодействия компонентов (модулей)

1. Для 3-5 основных сценариев работы программы в соответствии с ранее разработанной диаграммой прецедентов моделируется последовательность взаимодействия программных объектов. Эти диаграммы, нужны НЕ для отображения взаимодействия пользователя с интерфейсом (так хороший интерфейс должен быть интуитивно понятным), а для последующей реализации программы.
2. Для компонентов функциональности, пользовательского интерфейса постройте диаграммы последовательностей

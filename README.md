# <img width="5%" title="Wikipedia" src="media/logo/Wikipedia.svg"> Дипломный проект по тестирования мобильного приложения [Wikipedia](https://github.com/ApocalipticLove/AndroidStudio)

## :open_book: Содержание:

- [Технологии и инструменты](#technologist-технологии-и-инструменты)
- [Тест кейсы](#bookmark_tabs-тест-кейсы)
- [Запуск тестов из терминала](#computer-запуск-тестов-из-терминала)
- [Запуск тестов в Jenkins](#-запуск-тестов-в-jenkins)
- [Отчет о результатах тестирования в Allure Report](#-отчет-о-результатах-тестирования-в-Allure-report)
- [Уведомления в Telegram](#-уведомления-в-telegram)
- [Пример запуска теста в Browserstack](#-пример-запуска-теста-в-Browserstack)

## :gear: Технологии и инструменты

<p align="left">
<a href="https://www.jetbrains.com/idea/"><img src="media/logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA" title="IntelliJ IDEA"/></a>
<a href="https://www.java.com/"><img src="media/logo/Java.svg" width="50" height="50" alt="Java" title="Java"/></a>
<a href="https://gradle.org/"><img src="media/logo/Gradle.svg" width="50" height="50" alt="Gradle" title="Gradle"/></a>
<a href="https://junit.org/junit5/"><img src="media/logo/JUnit5.svg" width="50" height="50" alt="JUnit 5" title="JUnit 5"/></a>
<a href="https://github.com/"><img src="media/logo/GitHub.svg" width="50" height="50" alt="Github" title="GitHub"/></a>
<a href="https://developer.android.com/"><img src="media/logo/Android-studio.svg" width="50" height="50" alt="Android-studio" title="Android-studio"/></a>
<a href="https://appium.io/"><img src="media/logo/Appium.svg" width="50" height="50" alt="Appium" title="Appium"/></a>
<a href="https://www.browserstack.com/"><img src="media/logo/Browserstack.svg" width="50" height="50" alt="Browserstack" title="Browserstack"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="media/logo/Allure_Report.svg" width="50" height="50" alt="Allure" title="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="media/logo/Jenkins.svg" width="50" height="50" alt="Jenkins" title="Jenkins"/></a>
<a href="https://web.telegram.org/"><img src="media/logo/Telegram.svg" width="50" height="50" alt="Telegram" title="Telegram"></a>
</p>

## :heavy_check_mark: Тест кейсы

- Проверка поиска в приложении.
- Проверка прохождения начальных экранов.
- Проверка и создание списка с добавления в него новой статьи.

## :computer: Запуск тестов из терминала

### Удаленный запуск тестов

```bash
gradle -Denv=android clean android (Browserstack)
gradle -Denv=ios clean ios (Browserstack)
```

### Локальный запуск тестов

```bash
gradle -Denv=mobile clean android (AndroidStudio)
```

## <img width="4%" title="Jenkins" src="media/logo/Jenkins.svg"> Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/)

Для запуска сборки необходимо перейти в раздел <code><strong>*Собрать с параметрами*</strong></code> и нажать кнопку <code><strong>*Собрать*</strong></code>.

<p align="center">
  <img src="media/screen/start_jenkins.png" alt="Jenkins" width="800">
</p>

После выполнения сборки, в блоке <code><strong>*История сборок*</strong></code> напротив номера сборки появится
значок *Allure Report* кликнув по которому, откроется страница с сформированным html-отчетом и тестовой документацией.

## <img width="4%" title="Allure Report" src="media/logo/Allure_Report.svg"> Отчет о результатах тестирования в [Allure Report](https://jenkins.autotests.cloud/job/AndroidStudio_final/4/allure/)

<p align="center">
  <img src="media/screen/jenkins_overview.png" alt="allure-report" width="900">
</p>

### Основная страница с графиками

<p align="center">
  <img src="media/screen/dashboards.png" alt="dashboard" width="900">
</p>

### Тест кейсы в отчете allure

<p align="center">
  <img src="media/screen/allure-results.png" alt="dashboard" width="900">
</p>

## <img width="4%" title="Telegram" src="media/logo/Telegram.svg"> Уведомления в Telegram
После завершения сборки специальный бот, созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет сообщение с отчетом о прогоне тестов.

<p align="center">
<img title="Telegram Notifications" src="media/screen/Telegram.png">

## <img width="4%" title="Browserstack" src="media/logo/Browserstack.svg"> Пример запуска теста в Browserstack

К каждому тесту в отчете прилагается видео.

На данном видео выполняется:

- Проверка и создание списка с добавления в него новой статьи.


<p align="center">
  <img title="Browserstack Video" src="media/video/mobile_browserstack_test.gif">
</p>
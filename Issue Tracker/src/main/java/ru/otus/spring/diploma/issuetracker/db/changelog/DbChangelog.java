package ru.otus.spring.diploma.issuetracker.db.changelog;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.mongobee.changeset.ChangeLog;
import com.github.mongobee.changeset.ChangeSet;
import org.jongo.Jongo;
import ru.otus.spring.diploma.issuetracker.db.dpo.IssueDpo;

import java.util.Map;

import static ru.otus.spring.diploma.issuetracker.domain.Issue.Priority.HIGH;
import static ru.otus.spring.diploma.issuetracker.domain.Issue.Priority.LOW;
import static ru.otus.spring.diploma.issuetracker.domain.Issue.Priority.MEDIUM;
import static ru.otus.spring.diploma.issuetracker.domain.Issue.Priority.VERY_HIGH;
import static ru.otus.spring.diploma.issuetracker.domain.Issue.Priority.VERY_LOW;
import static ru.otus.spring.diploma.issuetracker.domain.IssueStatus.ANALYSIS;
import static ru.otus.spring.diploma.issuetracker.domain.IssueStatus.CLOSED;
import static ru.otus.spring.diploma.issuetracker.domain.IssueStatus.DEVELOPMENT;
import static ru.otus.spring.diploma.issuetracker.domain.IssueStatus.DONE;
import static ru.otus.spring.diploma.issuetracker.domain.IssueStatus.FEEDBACK;
import static ru.otus.spring.diploma.issuetracker.domain.IssueStatus.NEW;
import static ru.otus.spring.diploma.issuetracker.domain.IssueStatus.TESTING;
import static ru.otus.spring.diploma.issuetracker.domain.IssueStatus.VERIFIED;

@ChangeLog
public class DbChangelog {
    private final ObjectMapper jacksonMapper = new ObjectMapper();


    @ChangeSet(order = "001", id = "001", author = "dev")
    public void _001(Jongo jongo) {
        final var collection = jongo.getCollection("issueDpo");

        collection.insert(toSpringDocument(
                new IssueDpo(null, "SPRING-1", "AOP, Spring AOP", DESC1, FEEDBACK.ordinal(), MEDIUM.ordinal(), "user1", "programming")
        ));
        collection.insert(toSpringDocument(
                new IssueDpo(null, "SPRING-2", "DAO на Spring JDBC", DESC2, DEVELOPMENT.ordinal(), HIGH.ordinal(), "user2", "programming")
        ));
        collection.insert(toSpringDocument(
                new IssueDpo(null, "SPRING-3", "JPQL, Spring ORM, DAO на основе Spring ORM + JPA", DESC3, DEVELOPMENT.ordinal(), MEDIUM.ordinal(), "user2", "programming")
        ));
        collection.insert(toSpringDocument(
                new IssueDpo(null, "SPRING-4", "Транзакции, Spring Tx", DESC4, TESTING.ordinal(), VERY_LOW.ordinal(), "user1", "programming")
        ));
        collection.insert(toSpringDocument(
                new IssueDpo(null, "SPRING-5", "SQL и NoSQL базы данных", DESC5, NEW.ordinal(), LOW.ordinal(), "user3", "programming")
        ));
        collection.insert(toSpringDocument(
                new IssueDpo(null, "SPRING-6", "Reactive Stack", DESC6, NEW.ordinal(), MEDIUM.ordinal(), "user1", "programming")
        ));
        collection.insert(toSpringDocument(
                new IssueDpo(null, "SPRING-7", "Spring WebFlux", DESC7, ANALYSIS.ordinal(), MEDIUM.ordinal(), "user2", "programming")
        ));
        collection.insert(toSpringDocument(
                new IssueDpo(null, "SPRING-8", "Spring Integration: Монолиты vs. Microservices Round 1", DESC8, DONE.ordinal(), HIGH.ordinal(), "user3", "programming")
        ));
        collection.insert(toSpringDocument(
                new IssueDpo(null, "SPRING-9", "Spring Integration: Endpoints и Flow Components", DESC9, DONE.ordinal(), MEDIUM.ordinal(), "user2", "programming")
        ));
        collection.insert(toSpringDocument(
                new IssueDpo(null, "SPRING-10", "Docker, оркестрация, облака, облачные хостинги", DESC10, CLOSED.ordinal(), LOW.ordinal(), "user1", "programming")
        ));
        collection.insert(toSpringDocument(
                new IssueDpo(null, "SPRING-11", "Spring Cloud Data Flow, Hystrix Circuit Breaker", DESC11, VERIFIED.ordinal(), HIGH.ordinal(), "user1", "programming")
        ));

        collection.insert(toSpringDocument(
                new IssueDpo(null, "JAVASE-1", "Байт код", DESC12, VERIFIED.ordinal(), MEDIUM.ordinal(), "user1", "programming")
        ));
        collection.insert(toSpringDocument(
                new IssueDpo(null, "JAVASE-2", "Углубленные основы", DESC13, FEEDBACK.ordinal(), MEDIUM.ordinal(), "user2", "programming")
        ));
        collection.insert(toSpringDocument(
                new IssueDpo(null, "JAVASE-3", "Remote debug", DESC14, FEEDBACK.ordinal(), HIGH.ordinal(), "user3", "programming")
        ));
        collection.insert(toSpringDocument(
                new IssueDpo(null, "JAVASE-4", "Контейнеры и алгоритмы", DESC15, TESTING.ordinal(), VERY_HIGH.ordinal(), "user3", "programming")
        ));
        collection.insert(toSpringDocument(
                new IssueDpo(null, "JAVASE-5", "Инструменты для преобразования контейнеров", DESC16, TESTING.ordinal(), LOW.ordinal(), "user2", "programming")
        ));
        collection.insert(toSpringDocument(
                new IssueDpo(null, "JAVASE-6", "Сборщик мусора", DESC17, NEW.ordinal(), LOW.ordinal(), "user1", "programming")
        ));
        collection.insert(toSpringDocument(
                new IssueDpo(null, "JAVASE-7", "QA и тестирование", DESC18, DONE.ordinal(), MEDIUM.ordinal(), "user2", "programming")
        ));
        collection.insert(toSpringDocument(
                new IssueDpo(null, "JAVASE-8", "Аннотации", DESC19, DONE.ordinal(), HIGH.ordinal(), "user1", "programming")
        ));


        collection.insert(toSpringDocument(
                new IssueDpo(null, "PM-1", "Роль и цели", DESC20, ANALYSIS.ordinal(), VERY_HIGH.ordinal(), "user4", "business")
        ));
        collection.insert(toSpringDocument(
                new IssueDpo(null, "PM-2", "Качества и навыки", DESC21, CLOSED.ordinal(), VERY_LOW.ordinal(), "user5", "business")
        ));
        collection.insert(toSpringDocument(
                new IssueDpo(null, "PM-3", "Культура исполнения: про то как успевать больше", DESC22, CLOSED.ordinal(), MEDIUM.ordinal(), "user4", "business")
        ));
        collection.insert(toSpringDocument(
                new IssueDpo(null, "PM-4", "Культура выполнения: как не налажать в мелочах", DESC23, VERIFIED.ordinal(), LOW.ordinal(), "user4", "business")
        ));
        collection.insert(toSpringDocument(
                new IssueDpo(null, "PM-5", "Командообразование", DESC24, NEW.ordinal(), MEDIUM.ordinal(), "user5", "business")
        ));
        collection.insert(toSpringDocument(
                new IssueDpo(null, "PM-6", "Культура поведения и атмосфера", DESC25, VERIFIED.ordinal(), MEDIUM.ordinal(), "user5", "business")
        ));
        collection.insert(toSpringDocument(
                new IssueDpo(null, "PM-7", "Коммуникации", DESC26, DONE.ordinal(), VERY_HIGH.ordinal(), "user4", "business")
        ));
    }


    private Map<String, Object> toSpringDocument(Object dpo) {
        final Map<String, Object> map = jacksonMapper.convertValue(dpo, new TypeReference<Map<String, Object>>() {});
        map.put("_class", dpo.getClass());

        return map;
    }



    private static final String DESC1 = "Слушатели смогут познакомиться с аспектно-ориентированным программирование для создания crosscutting функциональностей в приложении с помощью Spring AOP. И, конечно, слушатели разберутся на чём базируются остальные фреймворки Spring.";
    private static final String DESC2 = "Слушатели смогут ориентироваться в архитекрутных паттернах, свзяанных с работой с БД.\nСлушатели смогут эффективно использовать Spring JDBC для разработки DAO в приложении.";
    private static final String DESC3 = "По окончанию данного модуля слушатели смогут разрабатывать ORM DAO в Spring-приложении с помощью Spring ORM + JPA + Hibernate (в качестве провайдера JPA).\n\nТакже слушатели узнаю про JPQL (аналог HQL).";
    private static final String DESC4 = "Слушатели погрузятся в теорию транзакций и поймут все особенности транзакций.\nТакже слушатели смогут использовать декларативное и императивное управление транзакциями в Spring-приложениях с помощью Spring Tx.";
    private static final String DESC5 = "По окончанию данного семинара слушатели начнут разбираться в особенностях реляционных и различных нереляционных (NoSQL) баз данных.\n\nТакже слушатели научатся правильно выбирать NoSQL БД для решения соответствующих задач.";
    private static final String DESC6 = "В данном модуле слушатели узнают, что такое Reactive программирование и познакомятся со Spring Reactive Stack для разработки веб-приложений.";
    private static final String DESC7 = "После данного занятия слушатели смогу создавать современные Reactive Web-приложения с помощью Spring WebFlux.";
    private static final String DESC8 = "По окончании данного модуля слушатели узнают два похода к разработке Enterprise-приложений - монолиты и микросервисы.\nУзнают, какие проблемы возникают при создании монолитов, что такое Messaging и Enterprise Integration Patterns (EIP) и где здесь Spring Integration.";
    private static final String DESC9 = "Слушатели также узнают про другие Endpoints и Flow Components и смогут разрабатывать сложные Enterprise-приложения c почти любой интеграцией.";
    private static final String DESC10 = "По окончании данного занятия слушатели смогут разбираться в вышеперечисленных словах, а также разбираться в современных принципах построения облачных систем.";
    private static final String DESC11 = "Слушатели смогут узнать как строятся огромные системы на Spring с использованием Spring Cloud Data Flow.\n\nТакже будет рассмотрен популярный фреймворк для использования внешних систем и ресурсов - Hystrix (+Hystrix Javanica) и его интеграция со Spring.";

    private static final String DESC12 = "Байт код. Содержание .class. Декомпиляция. Обфускация. История изменений языка Java от версии к версии. Разбор ДЗ.";
    private static final String DESC13 = "Углубленные основы. Загрузка классов. Виды и задачи class loader-ов. Класс Class&lt;?&gt;. Примитивные типы, строки, массивы. Память, которую занимают объекты.";
    private static final String DESC14 = "Hot swap. Remote debug. Сборщик мусора. Instrumentation. Разбор примеров и ДЗ.";
    private static final String DESC15 = "Generics. Контейнеры и алгоритмы. Обзор устройства и работы контейнеров из java.util. Сравнение контейнеров. Карты на основе хэш функции и на основе дерева. Разбор алгоритмов из java.util.Collections.";
    private static final String DESC16 = "Инструменты для преобразования контейнеров. Apache Commons. Google Guava. Разбор примеров и ДЗ.";
    private static final String DESC17 = "Параметры запуска VM. Сборщик мусора. Виды сборок. Разделение памяти под разные поколения объектов. Виды сборщиков. JMX. Управление приложением из jconsole. OutOfMemory. dump памяти. Исседование thread dump и heap dump.";
    private static final String DESC18 = "QA, тестирование. Виды тестов. \"Заглушки\". Testing frameworks: junit, mockito. Разбор примеров и ДЗ.";
    private static final String DESC19 = "Аннотации. Стандартные аннотации. Применение аннотаций. Типы аннотаций. Синтаксис. Создание своих аннтатаций. Reflection.";

    private static final String DESC20 = "В каких ролях выступает руководитель (их, кстати, немало); какие функции выполняет в каждой из ролей; какие цели стоят перед руководителем; кто ставит эти цели.";
    private static final String DESC21 = "Какими качествами должен обладать руководитель для успешной работы; какие навыки должен в себе развивать.";
    private static final String DESC22 = "Почему так важно выполнять намеченное; что этому мешает; в какую сторону и как \"прокачиваться";
    private static final String DESC23 = "Почему так важно не упускать детали; как этого избегать; как помогать в этом окружающим.";
    private static final String DESC24 = "Что делает команду командой; как организовать коллектив в команду.";
    private static final String DESC25 = "Что представляет из себя культура поведения в команде; как ее формировать и надо ли; от чего зависит атмосфера в команде и какой она должна быть.";
    private static final String DESC26 = "Как отстраивать процессы обмена информацией; за какими коммуникационными потоками надо следить отдельно; чем отличается хорошо налаженное взаимодействие";
}

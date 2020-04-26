create database docker_db_testing_tests;
create role docker_db_testing_tests with login nosuperuser inherit createdb nocreaterole noreplication password 'docker_db_testing_tests';
grant create, connect on database docker_db_testing_tests to docker_db_testing_tests;
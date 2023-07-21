# USAGE examples

Run in local chrome:

```bash
gradle clean test
```

Run in local chrome:

```bash
gradle clean test -Dbrowser=chrome
```

Run on remote hub with explicit auth:

```bash
gradle :test --tests "guru.qa.tests.GitHubSearchTest.blueSkySocialGitHubSearch" -Denv=local -DisRemote=true
```

Serve report:

```bash
allure serve build/allure-results
```

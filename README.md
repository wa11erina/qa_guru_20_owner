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
gradle clean test -DremoteUrl="https://user1:1234@selenoid.autotests.cloud/wd/hub/"
```

Serve report:

```bash
allure serve build/allure-results
```

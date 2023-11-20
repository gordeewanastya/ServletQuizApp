<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Astronomy Quiz</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <style>
    body {
      background-color: #f8f9fa;
    }

    .container {
      margin-top: 50px;
    }

    h2 {
      color: #007bff;
    }

    .question {
      margin-bottom: 20px;
    }

    .btn-primary {
      background-color: #007bff;
      border: none;
    }

    .btn-primary:hover {
      background-color: #0056b3;
    }
  </style>
</head>
<body>

<div class="container">
  <h2 class="text-center">Тестирование по астрономии</h2>

  <form id="quizForm" action="/quizServlet" method="post">
    <div class="question">
      <strong>1. Какая планета является самой большой в Солнечной системе?</strong><br>
      <div class="form-check">
        <input class="form-check-input" type="radio" id="q1" name="q1" value="a" required>
        <label class="form-check-label" for="q1">a. Земля</label>
      </div>
      <div class="form-check">
        <input class="form-check-input" type="radio" id="q1.2" name="q1" value="b">
        <label class="form-check-label" for="q2">b. Юпитер</label>
      </div>
      <div class="form-check">
        <input class="form-check-input" type="radio" id="q1.3" name="q1" value="c">
        <label class="form-check-label" for="q1.3">c. Венера</label>
      </div>
    </div>

    <div class="question">
      <strong>2. Что представляют собой астероиды?</strong><br>
      <div class="form-check">
        <input class="form-check-input" type="radio" id="q2" name="q2" value="a" required>
        <label class="form-check-label" for="q2">a. Маленькие планеты, вращающиеся вокруг Солнца</label>
      </div>
      <div class="form-check">
        <input class="form-check-input" type="radio" id="q2.1" name="q2" value="b">
        <label class="form-check-label" for="q2.1">b. Кольца, окружающие планеты</label>
      </div>
      <div class="form-check">
        <input class="form-check-input" type="radio" id="q2.3" name="q2" value="c">
        <label class="form-check-label" for="q2.3">c. Каменистые объекты, находящиеся в космосе</label>
      </div>
    </div>

    <div class="question">
      <strong>3. Какое количество спутников у Марса?</strong><br>
      <div class="form-check">
        <input class="form-check-input" type="radio" id="q3" name="q3" value="a" required>
        <label class="form-check-label" for="q3">a. 0</label>
      </div>
      <div class="form-check">
        <input class="form-check-input" type="radio" id="q3.1" name="q3" value="b">
        <label class="form-check-label" for="q3.1">b. 2</label>
      </div>
      <div class="form-check">
        <input class="form-check-input" type="radio" id="q3.3" name="q3" value="c">
        <label class="form-check-label" for="q3.3">c. 5</label>
      </div>
    </div>

    <div class="question">
      <strong>4. Что такое гравитационная сфера?</strong><br>
      <div class="form-check">
        <input class="form-check-input" type="radio" id="q4" name="q4" value="a" required>
        <label class="form-check-label" for="q4">a. Область притяжения земной гравитации</label>
      </div>
      <div class="form-check">
        <input class="form-check-input" type="radio" id="q4.1" name="q4" value="b">
        <label class="form-check-label" for="q4.1">b. Геометрическая фигура на поверхности планеты</label>
      </div>
      <div class="form-check">
        <input class="form-check-input" type="radio" id="q4.3" name="q4" value="c">
        <label class="form-check-label" for="q4.3">c. Спутник, вращающийся вокруг планеты</label>
      </div>
    </div>

    <div class="question">
      <strong>5. Какая планета известна своими кольцами?</strong><br>
      <div class="form-check">
        <input class="form-check-input" type="radio" id="q5" name="q5" value="a" required>
        <label class="form-check-label" for="q5">a. Юпитер</label>
      </div>
      <div class="form-check">
        <input class="form-check-input" type="radio" id="q5.1" name="q5" value="b">
        <label class="form-check-label" for="q5.1">b. Сатурн</label>
      </div>
      <div class="form-check">
        <input class="form-check-input" type="radio" id="q5.3" name="q5" value="c">
        <label class="form-check-label" for="q5.3">c. Нептун</label>
      </div>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>

</div>

</body>
</html>


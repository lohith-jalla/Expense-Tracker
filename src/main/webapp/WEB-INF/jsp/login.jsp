<html>
<head>
    <style>
        /* General Reset */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: Arial, sans-serif;
        }

        /* Body Styling */
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background: #f5f7fa;
        }

        /* Login Box Styling */
        .login-box {
            width: 360px;
            padding: 40px;
            background: #fff;
            box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
            text-align: center;
        }

        .login-box h1 {
            margin-bottom: 24px;
            color: #333;
            font-size: 28px;
        }

        /* Form Styling */
        form {
            display: flex;
            flex-direction: column;
        }

        form input {
            height: 40px;
            margin: 12px 0;
            padding: 0 10px;
            border: 1px solid #ddd;
            border-radius: 4px;
            outline: none;
            font-size: 16px;
            transition: 0.3s;
        }

        form input:focus {
            border-color: #3498db;
        }

        /* Button Styling */
        form button {
            height: 40px;
            background: #3498db;
            border: none;
            border-radius: 4px;
            color: #fff;
            font-size: 16px;
            font-weight: bold;
            cursor: pointer;
            transition: 0.3s;
        }

        form button:hover {
            background: #2980b9;
        }

        /* Link Styling */
        .login-box a {
            display: block;
            margin-top: 20px;
            color: #3498db;
            text-decoration: none;
            font-size: 14px;
        }

        .login-box a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
<div class="login-box">
    <h1>Login</h1>
    <form method="POST">
        <input type="text" name="email" placeholder="Email">
        <input type="password" name="password" placeholder="Password">
        <button type="submit">Login</button>
    </form>
    Don't have an account? <a href="/signup">Sign Up</a>
</div>
</body>
</html>

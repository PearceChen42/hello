import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Stack;

public class ScientificCalculator extends JFrame implements ActionListener {
    private JTextField display;
    private String currentInput = "";
    private boolean isRadians = true; // 默认使用弧度制

    // 按钮标签
    private final String[] buttonLabels = {
        "7", "8", "9", "/", "sin", "cos",
        "4", "5", "6", "*", "tan", "log",
        "1", "2", "3", "-", "√", "ln",
        "0", ".", "=", "+", "π", "e",
        "(", ")", "C", "←", "x²", "x^y",
        "Rad/Deg", "1/x", "n!", "^2", "10^x", "e^x"
    };

    public ScientificCalculator() {
        setTitle("科学计算器");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setLayout(new BorderLayout());

        // 显示区域
        display = new JTextField();
        display.setFont(new Font("Simsun", Font.PLAIN, 24));
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout.NORTH);

        // 按钮面板
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(6, 6, 5, 5));

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 16));
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
       
        switch (command) {
            case "=":
                calculateResult();
                break;
            case "C":
                currentInput = "";
                display.setText("");
                break;
            case "←":
                if (!currentInput.isEmpty()) {
                    currentInput = currentInput.substring(0, currentInput.length() - 1);
                    display.setText(currentInput);
                }
                break;
            case "Rad/Deg":
                isRadians = !isRadians;
                break;
            case "π":
                currentInput += "3.141592653589793";
                display.setText(currentInput);
                break;
            case "e":
                currentInput += "2.718281828459045";
                display.setText(currentInput);
                break;
            case "x²":
                currentInput += "^2";
                display.setText(currentInput);
                break;
            case "1/x":
                currentInput = "1/(" + currentInput + ")";
                display.setText(currentInput);
                break;
            case "n!":
                calculateFactorial();
                break;
            case "^2":
                squareCurrent();
                break;
            case "10^x":
                currentInput = "10^(" + currentInput + ")";
                display.setText(currentInput);
                break;
            case "e^x":
                currentInput = "e^(" + currentInput + ")";
                display.setText(currentInput);
                break;
            default:
                currentInput += command;
                display.setText(currentInput);
        }
    }

    private void calculateResult() {
        try {
            // 替换常数和函数
        	System.out.println("currentinput:" +currentInput);
            String expression = currentInput
                .replace("π", "3.141592653589793")
                .replace("e", "2.718281828459045")
                .replace("sin", "s").replace("cos", "c")
                .replace("tan", "t").replace("log", "l")
                .replace("ln", "n").replace("√", "q");
           System.out.println("expression:"+ expression);
            double result = evaluateExpression(expression);
            System.out.println("result:"+ result);
            currentInput = String.valueOf(result);
            display.setText(currentInput);
        } catch (Exception ex) {
            display.setText("错误");
            currentInput = "";
        }
    }

    private double evaluateExpression(String expression) {
        // 使用双栈法计算表达式
        Stack<Double> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();
       
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
           
            if (Character.isDigit(c) || c == '.') {
                StringBuilder num = new StringBuilder();
                while (i < expression.length() &&
                      (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    num.append(expression.charAt(i++));
                }
                i--;
                numbers.push(Double.parseDouble(num.toString()));
                System.out.println("numbers:"+numbers);
            } else if (c == '(') {
                operators.push(c);
            } else if (c == ')') {
                while (operators.peek() != '(') {
                    numbers.push(applyOp(operators.pop(), numbers.pop(), numbers.pop()));
                }
                operators.pop(); // 弹出 '('
            } else if (isFunction(c)) {
                operators.push(c);
            } else if (isOperator(c)) {
                while (!operators.empty() && hasPrecedence(c, operators.peek())) {
                    numbers.push(applyOp(operators.pop(), numbers.pop(), numbers.pop()));
                }
                operators.push(c);
            }
            System.out.println("return numbers:" + numbers+" OP :"+operators);
        }
       
        while (!operators.empty()) {
            numbers.push(applyOp(operators.pop(), numbers.pop(), numbers.pop()));
        }
       System.out.println("reutn numbers :"+numbers);
        return numbers.pop();
    }

    private boolean isFunction(char c) {
        return "sctlnq".indexOf(c) >= 0;
    }

    private boolean isOperator(char c) {
        return "+-*/^".indexOf(c) >= 0;
    }

    private boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')') return false;
        if ((op1 == '^') && (op2 == '*' || op2 == '/' || op2 == '+' || op2 == '-')) return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) return false;
        return true;
    }

    private double applyOp(char op, double b, double a) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if (b == 0) throw new ArithmeticException("除零错误");
                return a / b;
            case '^': return Math.pow(a, b);
            case 's': return Math.sin(isRadians ? b : Math.toRadians(b));
            case 'c': return Math.cos(isRadians ? b : Math.toRadians(b));
            case 't': return Math.tan(isRadians ? b : Math.toRadians(b));
            case 'l': return Math.log10(b);
            case 'n': return Math.log(b);
            case 'q': return Math.sqrt(b);
            default: throw new IllegalArgumentException("未知运算符: " + op);
        }
    }

    private void calculateFactorial() {
        try {
        	System.out.println(currentInput);
            double num = Double.parseDouble(currentInput);
            if (num < 0 || num != (int)num) {
                display.setText("错误: 非整数");
            } else {
                long result = 1;
                for (int i = 1; i <= (int)num; i++) {
                    result *= i;
                }
                currentInput = String.valueOf(result);
                display.setText(currentInput);
            }
        } catch (NumberFormatException ex) {
            display.setText("错误");
        }
    }

    private void squareCurrent() {
        try {
        	System.out.println(currentInput);
            double num = Double.parseDouble(currentInput);
            currentInput = String.valueOf(num * num);
            display.setText(currentInput);
        } catch (NumberFormatException ex) {
            display.setText("错误");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ScientificCalculator::new);
    }
}
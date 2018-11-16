//简单工厂模式
public class Operation{
	private double _number1 = 0;
	private double _number2 = 0;

	public double number1(){
		_number1 = value;
	}

	public double number2(){
		_number2 = value;
	}

	public virtual double GetResult(){
		double result = 0;
		return result;
	}
}

class OperationAdd:Operation{
	public Override double GetResult(){
		double result = 0;
		result = number1 + number2;
		return result;
	}
}

class OperationSub:Operation{
	public Override double GetResult(){
		double result = 0;
		result number1 - number2;
		return result;
	}
}

public class OperationFactory{
	public static Operation createOperation(string operation){
		Operation oper = null;
		switch(operation){
			case “+”：
				oper = new OperationAdd();
				break;
			case "=":
				oper = new OperationSub();
				break;
			case "*":
				oper = new OperationMul();
				break;
			case "/":
				oper = new OperationDiv();
				break;
		}
	return oper;
	}
}


//客户端代码：
Operation oper;
oper = OperationFactory.createOperation("+");
oper.number1 = 1;
oper.number2 = 2;
double result = oper.GetResult()


//工厂方法模式
interface IFactory{
	Operation CreateOperation();
}

class AddFactpry:IFactory{
	public Operation CreateOperation(){
		return new OperationAdd();
	}
}

//客户端代码：
IFactory operFactory = new AddFactpry();
Operation oper = operFactory.CreateOperation();
oper.number1 = 1;
oper.number2 = 2;
double result = oper.GetResult();
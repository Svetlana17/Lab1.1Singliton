public class FactoryMethodExsemple {
    //интерфейс набор контрактор к-ые должен реализовать класс
    interface  Pizzsa{

    };
    //класс орписание типа на основание интерфейса .т.е набора контракотов которые надо реализовать
    class ChigagoPizzsa implements Pizzsa{

    }
    class PapironniPizzsca implements Pizzsa{

    }
    class MoscovPizzsca implements Pizzsa{

    }
    class PiterPizzsca implements Pizzsa{

    }
    //не имеет собственной реализации содержит абстрактные метооды, к-ые надо реализовать
    abstract class PizzsaMekar {
     //фабричный метод предоставляет интерфейс
        public abstract Pizzsa factoryMethod();


    }
    //дочерникй класс  к-ому предоставляется интерфейс
    class PissaHat extends PizzsaMekar{
//реализуем интерфейс, метод предоставляет конкретную реализацию интерфейса
        public Pizzsa factoryMethod() {
          //в самом классе определяется как реализуется интерфейс
            return new ChigagoPizzsa();
        }
    }
    class  PissaSamara extends  PizzsaMekar{

        public Pizzsa factoryMethod() {
            return new PapironniPizzsca() ;

        }
    }
    class PizzaCompany extends  PizzsaMekar{

        public Pizzsa factoryMethod() {
            return new MoscovPizzsca();
        }
    }
    class  PizzaPiter extends  PizzsaMekar{

        public Pizzsa factoryMethod() {
            return new PiterPizzsca();
        }
    }

}

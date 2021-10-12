package tasks_13;

public class task_1317_implements_interface {
/*
The weather is fine
Реализуй в классе Today интерфейс Weather.
Подумай, как связан параметр type с методом getWeatherType().
Обрати внимание, что интерфейсы Weather и WeatherType уже реализованы в отдельных файлах.

Requirements:
1. Интерфейс Weather должен быть реализован в классе Today.
2. В классе Today должен быть реализован метод getWeatherType, объявленный в интерфейсе Weather.
3. Тип возвращаемого значения метода getWeatherType должен быть String.
4. Метод getWeatherType должен возвращать значение переменной type.

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Today(WeatherType.CLOUDY));
        System.out.println(new Today(WeatherType.FOGGY));
        System.out.println(new Today(WeatherType.FREEZING));
    }

    static class Today implements Weather{
        private String type;

        Today(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return String.format("Today it will be %s", this.getWeatherType());
        }

        public String getWeatherType(){
            return type;
        }
    }
}
 */
}

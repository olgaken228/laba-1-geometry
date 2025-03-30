# Функция для вычисления площади прямоугольника
def calculate_rectangle_area(width, height):
    return width * height

# Ввод данных от пользователя
width = float(input("Введите ширину прямоугольника: "))
height = float(input("Введите высоту прямоугольника: "))

# Вычисление площади
area = calculate_rectangle_area(width, height)

# Вывод результата
print(f"Площадь прямоугольника: {area}")

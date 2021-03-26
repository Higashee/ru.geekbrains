package ru.geekbrains.lesson9;

public class Exceptions {
    public static void main(String[] args) {

                String[][] arr = new String[][]{{"4", "3", "3", "3"}, {"2", "3", "7", "1"}, {"5", "2", "3", "8"}, {"2", "3", "9", "1"}};
                try {
                    try {
                        int result = application(arr);
                     System.out.println(result);

                    } catch (MyArraySizeException e) {
                        System.out.println("Превышен размер массива.");
                    }
                }
                catch (MyArrayDataException e) {
                    System.out.println("В массиве неправильное значение.");
                    System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
                }

            }


            public static int application(String[][] arr) throws MyArraySizeException, MyArrayDataException {
                int count = 0;
                if (arr.length != 4) {
                    throw new MyArraySizeException();
                }
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].length != 4) {
                        throw new MyArraySizeException();
                    }
                    for (int j = 0; j < arr[i].length; j++) {
                        try {
                            count = count + Integer.parseInt(arr[i][j]);
                        }
                        catch (NumberFormatException e) {
                            throw new MyArrayDataException(i, j);
                        }
                    }

                }
                return count;
            }

        }
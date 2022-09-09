package homework;

class Pair<T, U> {

    T firstValue;
    U secondValue;

    Status status;

    Pair(Status status) {
        this.status = status;
    }

    Pair(T firstValue, U secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.status = Status.FOUND;
    }

}

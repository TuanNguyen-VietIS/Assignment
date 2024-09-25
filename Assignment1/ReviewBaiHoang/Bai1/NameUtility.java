interface NameUtility {
    default String isNameUppercase(String name) {
        return name.toUpperCase();
    }
}
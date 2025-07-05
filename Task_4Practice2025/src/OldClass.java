@DeprecatedEx(message = "Используйте NewClass вместо этого")
class OldClass {
    @DeprecatedEx(message = "Используйте newMethod()")
    public void oldMethod() {}

    public void newMethod() {}
}
public static <T> T deserialize(String input, Class<T> tClass) throws IOException {
    return OBJECT_MAPPER.readValue(input, tClass);
}

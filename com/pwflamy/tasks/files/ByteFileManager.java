package FlamyMap.com.pwflamy.tasks.files;

/**
 * Изучение работы с FileInputStream/FileOutputStream, BufferedInputStream/BufferedOutputStream
 */
public class ByteFileManager {

    // Метод читает содержимое файла и возвращает его в виде массива байт
    public byte[] readAllBytesFromFile(String filePath) {
        return null;
    }

    // Метод записывает массив байт в файл
    public void writeBytesToFile(String filePath, byte[] bytes) {

    }

    /**
     * Объединяет два массива байт в один, чередуя элементы из каждого массива.
     *
     * <p>На выходе формируется новый массив, в котором сначала идёт первый элемент из первого массива,
     * затем первый элемент из второго массива, затем второй элемент из первого массива, второй элемент
     * из второго массива и так далее. Если один из массивов длиннее другого, его "хвост" будет добавлен
     * в конец результирующего массива.<p>
     *
     * Литкод задача, не имеет отношения к записи/чтения в файл
     */
    public byte[] combineByteArrays(byte[] a, byte[] b) {
        return null;
    }
}

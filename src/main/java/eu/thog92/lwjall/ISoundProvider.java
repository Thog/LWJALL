package eu.thog92.lwjall;

public interface ISoundProvider
{
    void setListenerLocation(float x, float y, float z);

    /**
     * Changes the listeners orientation using the specified coordinates.
     * @param lookX X element of the look-at direction.
     * @param lookY Y element of the look-at direction.
     * @param lookZ Z element of the look-at direction.
     * @param upX X element of the up direction.
     * @param upY Y element of the up direction.
     * @param upZ Z element of the up direction.
     */
    void setListenerOrientation(float lookX, float lookY, float lookZ, float upX, float upY, float upZ);

    void cleanUp();
}

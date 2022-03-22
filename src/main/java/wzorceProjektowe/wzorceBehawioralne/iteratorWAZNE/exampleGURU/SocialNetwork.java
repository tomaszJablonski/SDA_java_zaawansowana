package wzorceProjektowe.wzorceBehawioralne.iteratorWAZNE.exampleGURU;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);


}

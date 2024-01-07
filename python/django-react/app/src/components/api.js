import axios from 'axios';

const BASE_URL = 'http://localhost:8000';

const api = axios.create({
  baseURL: BASE_URL,
});

class BaseApi {
  constructor(app, subUrl) {
    this._app = app;
    this._subUrl = subUrl;
  }

  handleErrors(error, action) {
    console.error(`Error ${action}:`, error);
    throw error;
  }

  async get() {
    try {
      const response = await api.get(`${BASE_URL}/${this._app}/${this._subUrl}/`);
      return response;
    } catch (error) {
      return this.handleErrors(error, `fetching ${this._subUrl}`);
    }
  }

  async post(data) {
    try {
      await api.post(`${BASE_URL}/${this._app}/${this._subUrl}/`, data);
    } catch (error) {
      return this.handleErrors(error, `creating ${this._subUrl}`);
    }
  }

  async delete(uuid) {
    try {
      await api.delete(`${BASE_URL}/${this._app}/${this._subUrl}/${uuid}`);
    } catch (error) {
      return this.handleErrors(error, `deleting ${this._subUrl}`);
    }
  }

  async put(uuid, data) {
    try {
      await api.put(`${BASE_URL}/${this._app}/${this._subUrl}/${uuid}/`, data);
    } catch (error) {
      return this.handleErrors(error, `changing ${this._subUrl}`);
    }
  }
}

class ClassBikeApi extends BaseApi {
  constructor() {
    super('app', 'bikes');
  }
}

class ClassPersonApi extends BaseApi {
  constructor() {
    super('app', 'persons');
  }
}

const PersonApi = new ClassPersonApi();
export { PersonApi, ClassBikeApi };
